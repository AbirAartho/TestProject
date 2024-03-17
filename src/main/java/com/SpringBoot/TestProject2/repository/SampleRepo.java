package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SampleRepo extends JpaRepository<Sample, Long> {

    @Query(value = "SELECT \t\n" +
            "       `input_location`, \n" +
            "\tROUND(AVG(`input_turbidity`),3) input_turbidity, \n" +
            "\tROUND(AVG(`input_temperature`),3) input_temperature, \n" +
            "\tROUND(AVG(`input_colour`),3) input_colour, \n" +
            "\tROUND(AVG(`input_taste_and_odour`),3) input_taste_and_odour, \n" +
            "\tROUND(AVG(`input_solids`),3) input_solids, \n"  +
            "\tROUND(AVG(`inputec`),3) inputec, \n" +
            "\tROUND(AVG(`inputph`),3) inputph, \n" +
            "\tROUND(AVG(`input_chloride`),3) input_chloride, \n" +
            "\tROUND(AVG(`input_chlorine`),3) input_chlorine, \n" +
            "\tROUND(AVG(`input_sulphate`),3) input_sulphate, \n" +
            "\tROUND(AVG(`input_nitrogen`),3) input_nitrogen, \n" +
            "\tROUND(AVG(`input_fluoride`),3) input_fluoride, \n" +
            "\tROUND(AVG(`input_fe_mn`),3) input_fe_mn, \n" +
            "\tROUND(AVG(`input_cu_zn`),3) input_cu_zn, \n" +
            "\tROUND(AVG(`input_hardness`),3) input_hardness, \n" +
            "\tROUND(AVG(`inputdo`),3) inputdo, \n" +
            "\tROUND(AVG(`inputbod`),3) inputbod \n" +
            "\tFROM \n" +
            "\t`final`.`sample` \n" +
            "\tWHERE DATE(input_date) >= DATE( :startDate ) \n" +
            "\tAND DATE(input_date) <= DATE( :endDate ) \n" +
            "\tGROUP BY input_location ", nativeQuery = true)
    List<Object[]> getDataByDate(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
