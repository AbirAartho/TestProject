package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.Sample;
import com.SpringBoot.TestProject2.entity.Sample2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SampleRepo2 extends JpaRepository<Sample2, Long> {

    @Query(value = "SELECT `input_location`,\n" +
            "       Round(Avg(`inputco2`), 3)           inputco2,\n" +
            "       Round(Avg(`input_temperature`), 3)  input_temperature,\n" +
            "       Round(Avg(`input_humidity`), 3)     input_humidity,\n" +
            "       Round(Avg(`inputso2`), 3)           inputso2,\n" +
            "       Round(Avg(`inputnox`), 3)           inputnox,\n" +
            "       Round(Avg(`inputpm`), 3)            inputpm,\n" +
            "       Round(Avg(`input_air_velocity`), 3) input_air_velocity\n" +
            "FROM   sample2\n" +
            "WHERE  Date(input_date) >= Date(:startDate )\n" +
            "       AND Date(input_date) <= Date(:endDate)\n" +
            "GROUP  BY input_location " , nativeQuery = true)
    List<Object[]> getDataByDate(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
