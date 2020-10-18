package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
/**
 * 数据库连接与关闭工具类�??
 * @author 
 */
public class BaseDao {
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	/**
	 * 获取数据库连接对象�??
	 */
	public Connection getConnection() {
		String driverClass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		
		//Context ctx;
		// 获取连接并捕获异�?
		try {
			//ctx=new InitialContext();
			//DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/news");
		//	conn=ds.getConnection();	
			
			
			Class.forName(driverClass);
			conn=DriverManager.getConnection(url,"nh","123");
		}/* catch (NamingException e) {
			e.printStackTrace();
		} */catch (SQLException e) {
			e.printStackTrace();
		}  catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 关闭数据库连接�??
	 * @param conn 数据库连�?
	 * @param stmt Statement对象
	 * @param rs 结果�?
	 */
	public void closeAll() {
		// 若结果集对象不为空，则关�?
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 若Statement对象不为空，则关�?
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 若数据库连接对象不为空，则关�?
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 增�?�删、改操作
	 * @param sql sql语句
	 * @param prams 参数数组
	 * @return 执行结果
	 */
	public int exceuteUpdate(String sql,Object...prams){
		int result=0;
		conn=this.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			for(int i=0;i<prams.length;i++){
				pstmt.setObject(i+1, prams[i]);	
			}
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeAll();
		}
		return result;
	}
	/**
	 * 查询
	 */
	
	public ResultSet exceuteQuery(String sql,Object...params){
		
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			for(int i=0;i<params.length;i++){
				pstmt.setObject(i+1, params[i]);
			}
			
			rs=pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
}
