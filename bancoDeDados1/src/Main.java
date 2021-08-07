import dados.Pessoa;
import exception.DeleteException;
import persistencia.*;
import exception.InsertException;
import exception.SelectException;
import persistencia.Conexao;
import persistencia.PessoaDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        /*p.setIdPessoa(0);
        p.setNome("Andrei");
        p.setIdade(20);
        inserirPessoa(p);*/
        /*p = selectPessoa(0);
        System.out.println(p);*/
        deletePessoa(0);

    }

    public static void deletePessoa(int id){
        try {
            PessoaDAO pessoaDAO = PessoaDAO.getInstance();
            try {
                pessoaDAO.delete(id);
            }catch (DeleteException e){
                e.printStackTrace();
            }
        }catch (ClassNotFoundException | SelectException | SQLException e){
            e.printStackTrace();
        }
    }

    public static Pessoa novaPessoa(){
        Pessoa p = new Pessoa();

        System.out.println("Id: ");
        p.setIdPessoa(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nome: ");
        p.setNome(scanner.nextLine());
        System.out.println("Idade: ");
        p.setIdade(Integer.parseInt(scanner.nextLine()));

        return p;
    }

    private static void inserirPessoa(Pessoa pessoa){

        try {
            PessoaDAO pessoaDAO = PessoaDAO.getInstance();
            try{
                pessoaDAO.insert(pessoa);
            }catch (InsertException | SelectException e) {
                e.printStackTrace();
            }
        }catch (ClassNotFoundException | SQLException | SelectException e){
            e.printStackTrace();
        }
    }

    private static Pessoa selectPessoa(int id){
        try {
            PessoaDAO pessoaDAO = PessoaDAO.getInstance();
            try{
                Pessoa pessoa = pessoaDAO.select(id);
                return pessoa;
            }catch (SelectException e){
                e.printStackTrace();
            }
        }catch (ClassNotFoundException | SelectException | SQLException e){
            e.printStackTrace();
        }
        return null;
    }



}
