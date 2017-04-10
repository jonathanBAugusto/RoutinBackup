/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connJDBC.dao;

/**
 *
 * @author Suporte
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTables {
    private Connection connection;

    public CreateTables() {
        this.connection = ConnectionDataBase.getConnection();
    }

    public void createTablePessoas() {
        String sql = null;
        try {
            sql = "CREATE TABLE ROTINAS( " +
                    "id_rotina integer not null GENERATED ALWAYS AS " +
                    "IDENTITY (START WITH 1, INCREMENT BY 1) " +
                    "CONSTRAINT PK_ROTINAS PRIMARY KEY, " +
                    "titulo varchar(30) not null, " +
                    "dir varchar(120) not null, " +
                    "dest varchar(120) not null, " +
                    "tipo integer not null, " +
                    "hora varchar(6) not null, " +
                    "dias varchar(28) not null, " +
                    "zip integer not null" +
                    "situa integer not null" +
                    ")";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("CreateTables.createTablePessoas Ok!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void createTableTelefones() {
//        String sql = null;
//        try {
//            sql = "CREATE TABLE TELEFONES( " +
//                    "id_fone integer not null GENERATED ALWAYS AS " +
//                    "IDENTITY (START WITH 1, INCREMENT BY 1) " +
//                    "CONSTRAINT PK_TEFEFONES PRIMARY KEY, " +
//                    "numero varchar(12), " +
//                    "tipo varchar(11), " +
//                    "pessoa integer not null, " +
//                    "CONSTRAINT FK_PESSOAS FOREIGN KEY (pessoa) " +
//                    "REFERENCES PESSOAS (id_pessoa) " +
//                    ")";
//
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.execute();
//            stmt.close();
//            System.out.println("CreateTables.createTableTelefones Ok!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
