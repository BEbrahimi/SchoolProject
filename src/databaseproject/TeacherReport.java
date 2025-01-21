
package databaseproject;

import com.mysql.cj.protocol.Resultset;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class TeacherReport {
    
    public void TeacherReport(JTable table, String value){
        String sql="SELECT *FROM teacher_tbl WHERE CONCAT('teacnername','F_name','Address','educationLevel','Subject','Salary','DOB','gender','contact','email')LIKE ?";
        
        try(Connection con = DatabaseConnection.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql))
        {
            
            pstmt.setString(1, "%"+value+"%");
            ResultSet rs = pstmt.executeQuery();
            
            DefaultTableModel dtm = (DefaultTableModel)table.getModel();
            
            Object[]rows;
            
            while(rs.next()){
                rows = new Object[11];
                rows[0] = rs.getInt(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6);
                rows[6] = rs.getString(7);
                rows[7] = rs.getString(8);
                rows[8] = rs.getString(9);
                rows[9] = rs.getString(10);
                rows[10] = rs.getString(11);
                
                dtm.addRow(rows);
            }
            
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
