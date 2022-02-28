/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.DBcontext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Coach;
import model.CoachRole;
import model.Match;
import model.MyOpponent;
import model.MyTeam;
import model.Nationality;
import model.News;
import model.Player;
import model.PlayerRole;
import model.Tournament;
import model.TypeNews;

/**
 *
 * @author Admin
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        System.out.println(dao.getAllNationality());
//    }

    

    public List<Account> getAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4));
                list.add(a);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<Coach> getCoach() {
        List<Coach> list = new ArrayList<>();
        String query = "select * from Coach";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Coach c = new Coach(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7));
                list.add(c);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<CoachRole> getCoachRole() {
        List<CoachRole> list = new ArrayList<>();
        String query = "select * from CoachRole";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                CoachRole c = new CoachRole(rs.getInt(1), rs.getString(2));
                list.add(c);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<Match> getMatch() {
        List<Match> list = new ArrayList<>();
        String query = "select * from Match";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Match m = new Match(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                list.add(m);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<MyOpponent> getMyOpponent() {
        List<MyOpponent> list = new ArrayList<>();
        String query = "select * from MyOpponent";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                MyOpponent t = new MyOpponent(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(t);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<MyTeam> getMyTeam() {
        List<MyTeam> list = new ArrayList<>();
        String query = "select * from MyTeam";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                MyTeam m = new MyTeam(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(m);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public ArrayList<Nationality> getAllNationality() {
        ArrayList<Nationality> listNationality = new ArrayList<>();
        String query = "select * from Nationality";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int nationalityId = rs.getInt(1);
                String nationalityName = rs.getString(2);
                String img = rs.getString(3);
                Nationality n = new Nationality(nationalityId, nationalityName, img);
                listNationality.add(n);
            }
        } catch (Exception e) {
            
        }
        return listNationality;
    }

    public List<News> getNews() {
        List<News> list = new ArrayList<>();
        String query = "select * from News";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                News w = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                list.add(w);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<PlayerRole> getPlayerRole() {
        List<PlayerRole> list = new ArrayList<>();
        String query = "select * from PlayerRole";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                PlayerRole e = new PlayerRole(rs.getInt(1), rs.getString(2));
                list.add(e);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<Tournament> getTournament() {
        List<Tournament> list = new ArrayList<>();
        String query = "select * from Tournament";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Tournament t = new Tournament(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(t);
            }
        } catch (Exception e) {

        }

        return list;
    }

    public List<TypeNews> getTypeNews() {
        List<TypeNews> list = new ArrayList<>();
        String query = "select * from TypeNews";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TypeNews s = new TypeNews(rs.getInt(1), rs.getString(2));
                list.add(s);
            }
        } catch (Exception e) {

        }

        return list;
    }
    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String query = "select * from Player";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int playerId = rs.getInt(1);
                String playerName = rs.getString(2);
                String img = rs.getString(3);
                Date dob = rs.getDate(4);
                String birthPlace = rs.getString(5);
                int nationalityId = rs.getInt(6);
                float height = rs.getFloat(7);
                float weight = rs.getFloat(8);
                int roleId = rs.getInt(9);
                String imgBackground = rs.getString(10);
                int number = rs.getInt(11);
                String shortDescription = rs.getString(12);
                String playerInfor = rs.getString(13);
                int managerId = rs.getInt(14);
                Player r = new Player(playerId, playerName, img, dob, birthPlace, nationalityId, number, number, roleId, imgBackground, number, shortDescription, playerInfor);
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }
    public ArrayList<Player> getAllGoalkeepers() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String query = "select * from Player where roleId = 1";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int playerId = rs.getInt(1);
                String playerName = rs.getString(2);
                String img = rs.getString(3);
                Date dob = rs.getDate(4);
                String birthPlace = rs.getString(5);
                int nationalityId = rs.getInt(6);
                float height = rs.getFloat(7);
                float weight = rs.getFloat(8);
                int roleId = rs.getInt(9);
                String imgBackground = rs.getString(10);
                int number = rs.getInt(11);
                String shortDescription = rs.getString(12);
                String playerInfor = rs.getString(13);
                int managerId = rs.getInt(14);
                Player r = new Player(playerId, playerName, img, dob, birthPlace, nationalityId, number, number, roleId, imgBackground, number, shortDescription, playerInfor);
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllDefenders() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String query = "select * from Player where roleId = 2";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int playerId = rs.getInt(1);
                String playerName = rs.getString(2);
                String img = rs.getString(3);
                Date dob = rs.getDate(4);
                String birthPlace = rs.getString(5);
                int nationalityId = rs.getInt(6);
                float height = rs.getFloat(7);
                float weight = rs.getFloat(8);
                int roleId = rs.getInt(9);
                String imgBackground = rs.getString(10);
                int number = rs.getInt(11);
                String shortDescription = rs.getString(12);
                String playerInfor = rs.getString(13);
                int managerId = rs.getInt(14);
                Player r = new Player(playerId, playerName, img, dob, birthPlace, nationalityId, number, number, roleId, imgBackground, number, shortDescription, playerInfor);
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllMidfielders() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String query = "select * from Player where roleId = 3";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int playerId = rs.getInt(1);
                String playerName = rs.getString(2);
                String img = rs.getString(3);
                Date dob = rs.getDate(4);
                String birthPlace = rs.getString(5);
                int nationalityId = rs.getInt(6);
                float height = rs.getFloat(7);
                float weight = rs.getFloat(8);
                int roleId = rs.getInt(9);
                String imgBackground = rs.getString(10);
                int number = rs.getInt(11);
                String shortDescription = rs.getString(12);
                String playerInfor = rs.getString(13);
                int managerId = rs.getInt(14);
                Player r = new Player(playerId, playerName, img, dob, birthPlace, nationalityId, number, number, roleId, imgBackground, number, shortDescription, playerInfor);
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllForwards() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String query = "select * from Player where roleId = 4";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int playerId = rs.getInt(1);
                String playerName = rs.getString(2);
                String img = rs.getString(3);
                Date dob = rs.getDate(4);
                String birthPlace = rs.getString(5);
                int nationalityId = rs.getInt(6);
                float height = rs.getFloat(7);
                float weight = rs.getFloat(8);
                int roleId = rs.getInt(9);
                String imgBackground = rs.getString(10);
                int number = rs.getInt(11);
                String shortDescription = rs.getString(12);
                String playerInfor = rs.getString(13);
                int managerId = rs.getInt(14);
                Player r = new Player(playerId, playerName, img, dob, birthPlace, nationalityId, number, number, roleId, imgBackground, number, shortDescription, playerInfor);
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }
}
