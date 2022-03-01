/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Nationality;
import model.Player;

/**
 *
 * @author Admin
 */
public class PlayerDBContext extends DBContext{
    
    public ArrayList<Nationality> getAllNationality() {
        ArrayList<Nationality> listNationality = new ArrayList<>();
        try {
            String sql = "select * from Nationality";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
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
    public ArrayList<Player> getAllGoalkeepers() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        
        try {
            String sql = "select * from Player where roleId = 1";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)
                        , rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllDefenders() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        
        try {
            String sql = "select * from Player where roleId = 2";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)
                        , rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllMidfielders() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        
        try {
            String sql = "select * from Player where roleId = 3";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)
                        , rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllForwards() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        
        try {
            String sql = "select * from Player where roleId = 4";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)
                        , rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }
    
}
