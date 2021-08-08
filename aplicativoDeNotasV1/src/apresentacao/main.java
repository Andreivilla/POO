package apresentacao;

import exception.DeleteException;
import exception.SelectException;
import persistencia.*;
import dados.*;
import negocio.Sistema;
import exception.*;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        //20549495070
        sistema.login("20549495070", "12345");
        System.out.println(sistema.getAlunoLogado());



    }
}