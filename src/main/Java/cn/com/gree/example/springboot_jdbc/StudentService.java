package cn.com.gree.example.springboot_jdbc;

import cn.com.gree.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getList(){
        String sql = "SELECT ID,NAME,SumScore,AvgScore, AGE FROM STUDENT";
        return jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setId(resultSet.getInt("ID"));
                stu.setName(resultSet.getString("NAME"));
                stu.setSumScore(resultSet.getString("SumScore"));
                stu.setAvgScore(resultSet.getString("AvgScore"));
                stu.setAge(resultSet.getInt("AGE"));
                return stu;
            }
        });

    }
}
