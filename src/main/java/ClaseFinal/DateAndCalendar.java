package ClaseFinal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendar {
    public static void main(String[] args) {

        //JAVA 9 para abajo
        Date  fecha = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaTransformada = format.format(fecha);
        System.out.println("fechaTransformada "+fechaTransformada);
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar "+calendar);
        System.out.println("Date "+fecha);


        //Esto se utiliza en las verciones de 9 para arriba
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime "+ldt);
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate "+localDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String localDateFormat = localDate.format(dtf);
        System.out.println("localDateFormat "+ localDateFormat);

        LocalDate fechaHoy=LocalDate.now();
        LocalDate fechaCumpleaños=LocalDate.of(1987,6,30);

        Period periodo= Period.between(fechaCumpleaños,fechaHoy);
        System.out.println(periodo.getYears());

        //pedir fecha por consola

        Scanner scanner= new Scanner(System.in);
       System.out.println("Dame tu Fecha de nacimiento (DD/MM/YYYY): ");
      String fechaNacimiento=scanner.next();
        DateTimeFormatter fnf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaHooy=LocalDate.now();
        LocalDate fechCumpleanos=LocalDate.parse(fechaNacimiento,fnf);
        //DateTimeFormatter fnf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //String fechaformato = fechCumpleanos.format(dtf);

        Period edad=Period.between(fechCumpleanos,fechaHooy);
        System.out.println("Tu tienes "+edad.getYears()+" años.");

        scanner.close();
    }

}