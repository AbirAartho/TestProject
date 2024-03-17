package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.Sample;
import com.SpringBoot.TestProject2.entity.Sample3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SampleRepo3 extends JpaRepository<Sample3, Long> {




    /*
    *     SELECT \t\t\n" +
            "     0 id4," +
            "      '' `input_date`,\n" +
            "         '' input_day,\n" +
            "         '' `input_time`,   " +
            " `input_location`, \n" +
            "\t ROUND(AVG(`inputcec`),3) inputcec, \n" +
            "\t ROUND(AVG(`input_ca`),3) input_ca, \n" +
            "\t ROUND(AVG(`input_cu`),4) input_cu, \n" +
            "\tROUND(AVG(`input_fe`),3) input_fe, \n" +
            "\tROUND(AVG(`inputk`),3) inputk, \n" +
            "\tROUND(AVG(`input_mg`),3) input_mg, \n" +
            "\tROUND(AVG(`input_mn`),3) input_mn, \n" +
            "\tROUND(AVG(`input_na`),3) input_na, \n" +
            "\tROUND(AVG(`inputom`),3) inputom, \n" +
            "\tROUND(AVG(`inputp`),3) inputp, \n" +
            "\tROUND(AVG(`inputs`),3) inputs, \n" +
            "\tROUND(AVG(`input_zn`),3) input_zn, \n" +
            "\tROUND(AVG(`inputph`),3) inputph \n" +
            "\tFROM \n" +
            "\t`final`.`sample3` \n" +
            "\tWHERE DATE(input_date) >= DATE( :startDate)\n" +
            "\tAND DATE(input_date) <= DATE( :endDate )\n" +
            "\tGROUP BY input_location"*/

    @Query(value = "SELECT \t\n" +
            "       `input_location`, \n" +
            "\tROUND(AVG(`inputcec`),3) inputcec, \n" +
            "\tROUND(AVG(`input_ca`),3) input_ca, \n" +
            "\tROUND(AVG(`input_cu`),3) input_cu, \n" +
            "\tROUND(AVG(`input_fe`),3) input_fe, \n" +
            "\tROUND(AVG(`inputk`),3) inputk, \n"  +
            "\tROUND(AVG(`input_mg`),3) input_mg, \n" +
            "\tROUND(AVG(`input_mn`),3) input_mn, \n" +
            "\tROUND(AVG(`input_na`),3) input_na, \n" +
            "\tROUND(AVG(`inputom`),3) inputom, \n" +
            "\tROUND(AVG(`inputp`),3) inputp, \n" +
            "\tROUND(AVG(`inputs`),3) inputs, \n" +
            "\tROUND(AVG(`input_zn`),3) input_zn, \n" +
            "\tROUND(AVG(`inputph`),3) inputph \n" +
            "\tFROM \n" +
            "\t`final`.`sample3` \n" +
            "\tWHERE DATE(input_date) >= DATE( :startDate ) \n" +
            "\tAND DATE(input_date) <= DATE( :endDate ) \n" +
            "\tGROUP BY input_location ", nativeQuery = true)
    List<Object[]> getDataByDate(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
