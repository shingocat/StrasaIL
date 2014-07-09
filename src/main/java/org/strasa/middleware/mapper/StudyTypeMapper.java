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
import org.strasa.middleware.model.StudyType;
import org.strasa.middleware.model.StudyTypeExample;

public interface StudyTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@SelectProvider(type = StudyTypeSqlProvider.class, method = "countByExample")
	int countByExample(StudyTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@DeleteProvider(type = StudyTypeSqlProvider.class, method = "deleteByExample")
	int deleteByExample(StudyTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@Delete({ "delete from studytype", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@Insert({ "insert into studytype (studytype)",
			"values (#{studytype,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(StudyType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@InsertProvider(type = StudyTypeSqlProvider.class, method = "insertSelective")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insertSelective(StudyType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@SelectProvider(type = StudyTypeSqlProvider.class, method = "selectByExample")
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "studytype", property = "studytype", jdbcType = JdbcType.VARCHAR) })
	List<StudyType> selectByExample(StudyTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@Select({ "select", "id, studytype", "from studytype",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "studytype", property = "studytype", jdbcType = JdbcType.VARCHAR) })
	StudyType selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@UpdateProvider(type = StudyTypeSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") StudyType record,
			@Param("example") StudyTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@UpdateProvider(type = StudyTypeSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") StudyType record,
			@Param("example") StudyTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@UpdateProvider(type = StudyTypeSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(StudyType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studytype
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	@Update({ "update studytype",
			"set studytype = #{studytype,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(StudyType record);
}