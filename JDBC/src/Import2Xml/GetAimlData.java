package Import2Xml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lonely
 */
public class GetAimlData {

    public List<aiml> getList() {
        List<aiml> list = new ArrayList<aiml>();
        try {
            aiml p = null;
            String sql = "Select * from tb_aiml_questions";
            Connection conn = DBUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new aiml(rs.getInt(1),rs.getString(2) ,rs.getString(3));
                list.add(p);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(GetAimlData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}