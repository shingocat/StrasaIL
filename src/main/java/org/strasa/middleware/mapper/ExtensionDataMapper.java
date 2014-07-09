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
import org.strasa.middleware.model.ExtensionData;
import org.strasa.middleware.model.ExtensionDataExample;

public interface ExtensionDataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@SelectProvider(type = ExtensionDataSqlProvider.class, method = "countByExample")
	int countByExample(ExtensionDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@DeleteProvider(type = ExtensionDataSqlProvider.class, method = "deleteByExample")
	int deleteByExample(ExtensionDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@Delete({ "delete from extensiondata", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@Insert({
			"insert into extensiondata (programid, projectid, ",
			"germplasmname, yearextension, ",
			"locationextension, countryextension, ",
			"area, datasource, ",
			"yearrelease, countryrelease, ",
			"seedavailability, numseeddistributed, ",
			"numfarmersadopted, grainyldtons, ",
			"userid)",
			"values (#{programid,jdbcType=INTEGER}, #{projectid,jdbcType=INTEGER}, ",
			"#{germplasmname,jdbcType=VARCHAR}, #{yearextension,jdbcType=VARCHAR}, ",
			"#{locationextension,jdbcType=VARCHAR}, #{countryextension,jdbcType=VARCHAR}, ",
			"#{area,jdbcType=DOUBLE}, #{datasource,jdbcType=VARCHAR}, ",
			"#{yearrelease,jdbcType=VARCHAR}, #{countryrelease,jdbcType=VARCHAR}, ",
			"#{seedavailability,jdbcType=INTEGER}, #{numseeddistributed,jdbcType=INTEGER}, ",
			"#{numfarmersadopted,jdbcType=INTEGER}, #{grainyldtons,jdbcType=DOUBLE}, ",
			"#{userid,jdbcType=INTEGER})" })
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(ExtensionData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@InsertProvider(type = ExtensionDataSqlProvider.class, method = "insertSelective")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insertSelective(ExtensionData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@SelectProvider(type = ExtensionDataSqlProvider.class, method = "selectByExample")
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "programid", property = "programid", jdbcType = JdbcType.INTEGER),
			@Result(column = "projectid", property = "projectid", jdbcType = JdbcType.INTEGER),
			@Result(column = "germplasmname", property = "germplasmname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "yearextension", property = "yearextension", jdbcType = JdbcType.VARCHAR),
			@Result(column = "locationextension", property = "locationextension", jdbcType = JdbcType.VARCHAR),
			@Result(column = "countryextension", property = "countryextension", jdbcType = JdbcType.VARCHAR),
			@Result(column = "area", property = "area", jdbcType = JdbcType.DOUBLE),
			@Result(column = "datasource", property = "datasource", jdbcType = JdbcType.VARCHAR),
			@Result(column = "yearrelease", property = "yearrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "countryrelease", property = "countryrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "seedavailability", property = "seedavailability", jdbcType = JdbcType.INTEGER),
			@Result(column = "numseeddistributed", property = "numseeddistributed", jdbcType = JdbcType.INTEGER),
			@Result(column = "numfarmersadopted", property = "numfarmersadopted", jdbcType = JdbcType.INTEGER),
			@Result(column = "grainyldtons", property = "grainyldtons", jdbcType = JdbcType.DOUBLE),
			@Result(column = "userid", property = "userid", jdbcType = JdbcType.INTEGER) })
	List<ExtensionData> selectByExample(ExtensionDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@Select({
			"select",
			"id, programid, projectid, germplasmname, yearextension, locationextension, countryextension, ",
			"area, datasource, yearrelease, countryrelease, seedavailability, numseeddistributed, ",
			"numfarmersadopted, grainyldtons, userid", "from extensiondata",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "programid", property = "programid", jdbcType = JdbcType.INTEGER),
			@Result(column = "projectid", property = "projectid", jdbcType = JdbcType.INTEGER),
			@Result(column = "germplasmname", property = "germplasmname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "yearextension", property = "yearextension", jdbcType = JdbcType.VARCHAR),
			@Result(column = "locationextension", property = "locationextension", jdbcType = JdbcType.VARCHAR),
			@Result(column = "countryextension", property = "countryextension", jdbcType = JdbcType.VARCHAR),
			@Result(column = "area", property = "area", jdbcType = JdbcType.DOUBLE),
			@Result(column = "datasource", property = "datasource", jdbcType = JdbcType.VARCHAR),
			@Result(column = "yearrelease", property = "yearrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "countryrelease", property = "countryrelease", jdbcType = JdbcType.VARCHAR),
			@Result(column = "seedavailability", property = "seedavailability", jdbcType = JdbcType.INTEGER),
			@Result(column = "numseeddistributed", property = "numseeddistributed", jdbcType = JdbcType.INTEGER),
			@Result(column = "numfarmersadopted", property = "numfarmersadopted", jdbcType = JdbcType.INTEGER),
			@Result(column = "grainyldtons", property = "grainyldtons", jdbcType = JdbcType.DOUBLE),
			@Result(column = "userid", property = "userid", jdbcType = JdbcType.INTEGER) })
	ExtensionData selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@UpdateProvider(type = ExtensionDataSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") ExtensionData record,
			@Param("example") ExtensionDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@UpdateProvider(type = ExtensionDataSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") ExtensionData record,
			@Param("example") ExtensionDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@UpdateProvider(type = ExtensionDataSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(ExtensionData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table extensiondata
	 * @mbggenerated  Tue Feb 18 10:48:32 SGT 2014
	 */
	@Update({ "update extensiondata",
			"set programid = #{programid,jdbcType=INTEGER},",
			"projectid = #{projectid,jdbcType=INTEGER},",
			"germplasmname = #{germplasmname,jdbcType=VARCHAR},",
			"yearextension = #{yearextension,jdbcType=VARCHAR},",
			"locationextension = #{locationextension,jdbcType=VARCHAR},",
			"countryextension = #{countryextension,jdbcType=VARCHAR},",
			"area = #{area,jdbcType=DOUBLE},",
			"datasource = #{datasource,jdbcType=VARCHAR},",
			"yearrelease = #{yearrelease,jdbcType=VARCHAR},",
			"countryrelease = #{countryrelease,jdbcType=VARCHAR},",
			"seedavailability = #{seedavailability,jdbcType=INTEGER},",
			"numseeddistributed = #{numseeddistributed,jdbcType=INTEGER},",
			"numfarmersadopted = #{numfarmersadopted,jdbcType=INTEGER},",
			"grainyldtons = #{grainyldtons,jdbcType=DOUBLE},",
			"userid = #{userid,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(ExtensionData record);
}