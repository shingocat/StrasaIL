package org.strasa.middleware.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.strasa.middleware.model.ReleaseInfo;
import org.strasa.middleware.model.ReleaseInfoExample;

public interface ReleaseInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@SelectProvider(type = ReleaseInfoSqlProvider.class, method = "countByExample")
	int countByExample(ReleaseInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@DeleteProvider(type = ReleaseInfoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(ReleaseInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@Delete({ "delete from releaseinfo", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@Insert({
			"insert into releaseinfo (programid, projectid, ",
			"germplasmname, datasource, ",
			"yearrelease, countryrelease, ",
			"seedavailability, userid)",
			"values (#{programid,jdbcType=INTEGER}, #{projectid,jdbcType=INTEGER}, ",
			"#{germplasmname,jdbcType=VARCHAR}, #{datasource,jdbcType=VARCHAR}, ",
			"#{yearrelease,jdbcType=VARCHAR}, #{countryrelease,jdbcType=VARCHAR}, ",
			"#{seedavailability,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER})" })
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(ReleaseInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@InsertProvider(type = ReleaseInfoSqlProvider.class, method = "insertSelective")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insertSelective(ReleaseInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@SelectProvider(type = ReleaseInfoSqlProvider.class, method = "selectByExample")
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "programid", property = "programid", jdbcType = JdbcType.INTEGER),
			@Result(column = "projectid", property = "projectid", jdbcType = JdbcType.INTEGER),
			@Result(column = "germplasmname", property = "germplasmname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "datasource", property = "datasource", jdbcType = JdbcType.VARCHAR),
			@Result(column = "yearrelease", property = "yearrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "countryrelease", property = "countryrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "seedavailability", property = "seedavailability", jdbcType = JdbcType.INTEGER),
			@Result(column = "userid", property = "userid", jdbcType = JdbcType.INTEGER) })
	List<ReleaseInfo> selectByExample(ReleaseInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@Select({
			"select",
			"id, programid, projectid, germplasmname, datasource, yearrelease, countryrelease, ",
			"seedavailability, userid", "from releaseinfo",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "programid", property = "programid", jdbcType = JdbcType.INTEGER),
			@Result(column = "projectid", property = "projectid", jdbcType = JdbcType.INTEGER),
			@Result(column = "germplasmname", property = "germplasmname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "datasource", property = "datasource", jdbcType = JdbcType.VARCHAR),
			@Result(column = "yearrelease", property = "yearrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "countryrelease", property = "countryrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "seedavailability", property = "seedavailability", jdbcType = JdbcType.INTEGER),
			@Result(column = "userid", property = "userid", jdbcType = JdbcType.INTEGER) })
	ReleaseInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@UpdateProvider(type = ReleaseInfoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") ReleaseInfo record,
			@Param("example") ReleaseInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@UpdateProvider(type = ReleaseInfoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") ReleaseInfo record,
			@Param("example") ReleaseInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@UpdateProvider(type = ReleaseInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(ReleaseInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	@Update({ "update releaseinfo",
			"set programid = #{programid,jdbcType=INTEGER},",
			"projectid = #{projectid,jdbcType=INTEGER},",
			"germplasmname = #{germplasmname,jdbcType=VARCHAR},",
			"datasource = #{datasource,jdbcType=VARCHAR},",
			"yearrelease = #{yearrelease,jdbcType=VARCHAR},",
			"countryrelease = #{countryrelease,jdbcType=VARCHAR},",
			"seedavailability = #{seedavailability,jdbcType=INTEGER},",
			"userid = #{userid,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(ReleaseInfo record);
}