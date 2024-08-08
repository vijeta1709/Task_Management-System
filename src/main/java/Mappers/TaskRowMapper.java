
package Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.google.protobuf.Timestamp;

import model.task; // Import the Task class
 public class TaskRowMapper implements RowMapper<task> {
    @Override
    public task mapRow(ResultSet rs, int rowNum) throws SQLException {
         task k = new task();
        k.setId(rs.getInt("id"));
        k.setTitle(rs.getString("title"));
        k.setDescription(rs.getString("description"));
        k.setPriority(rs.getNString("priority"));
        k.setDueDate(rs.getNString("dueDate"));
                 

        // Handle other timestamps similarly
        java.sql.Timestamp createdAtTimestamp = rs.getTimestamp("created_at");
        if (createdAtTimestamp != null) {
            k.setCreateAt(createdAtTimestamp.toLocalDateTime());
        } else {
            k.setCreateAt(null);
        }

        java.sql.Timestamp updatedAtTimestamp = rs.getTimestamp("updated_at");
        if (updatedAtTimestamp != null) {
           k.setUpdateAt(updatedAtTimestamp.toLocalDateTime());
        } else {
            k.setUpdateAt(null);
        }
        k.setCompleted(rs.getBoolean("completed"));
        java.sql.Timestamp completedAtTimestamp = rs.getTimestamp("completed_at");
        if (completedAtTimestamp != null) {
            k.setCompletedAt(completedAtTimestamp.toLocalDateTime());
        } else {
            k.setCompletedAt(null);
        }

        return k;
    }
}
