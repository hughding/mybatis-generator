package pers.hugh.dao;

import pers.hugh.entity.City;

public interface CityDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    City selectByPrimaryKey(Integer ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(City record);
}