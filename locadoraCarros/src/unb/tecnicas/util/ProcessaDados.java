package unb.tecnicas.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class ProcessaDados {

    public static int getValidId(List<Integer> ids, String mensagem) {
        Scanner s = new Scanner(System.in);
        int id = 0;
        do {
            System.out.print("\n" + mensagem);
            id = s.nextInt();
            if (validaId(ids, id)) {
                break;
            } else {
                System.out.print("\nInforme um id valido por favor!");
            }
        } while (Boolean.TRUE);
        return id;
    }

    public static LocalDateTime getValidDate(String mensagem) {
        Scanner s = new Scanner(System.in);
        String data;
        LocalDateTime localDateTime = LocalDateTime.now();
        do {
            System.out.print("\n" + mensagem);
            data = s.nextLine();
            try {
                localDateTime = DataUtil.stringToDate(data);
                break;
            } catch (DateTimeParseException e) {
                System.out.print("\nInforme uma data valida por favor!");

            }
        } while (Boolean.TRUE);
        return localDateTime;
    }


    private static Boolean validaId(List<Integer> ids, int id) {
        if (id < 0) {
            return Boolean.FALSE;
        }
        return ids.stream().filter( f -> f.equals(id)).collect(Collectors.toList()).size() > 0;
    }


}
