package com.spring.crud.demo.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import com.spring.crud.demo.model.emp.*;
import com.spring.crud.demo.model.emp.Employee;
import com.spring.crud.demo.model.Student;
import com.spring.crud.demo.model.SuperHero;

public class HelperUtil {

    private HelperUtil() {
    }

//	public static Supplier<List<Event>> eventsSupplier = () -> {
//		Meeting e1 = Meeting.builder()
//				.id(1)
//				.owner("owner")
//				.startTime(LocalDate.parse("2021-09-21").atStartOfDay())
//				.endTime(LocalDate.parse("2021-09-21").atStartOfDay().plus(Duration.ofMinutes(30)))
//				.userList(Arrays.asList(
//						User.builder().userId(1).name("Tanmayi").accepted(true).build(),
//						User.builder().userId(1).name("Thomas").accepted(false).build()
//				))
//				.l("Some location")
//				.build();
//
//
//
//
//		return Arrays.asList(e1);
//
//
//	};
    public static Supplier<List<Student>> studentSupplier = () ->
            Arrays.asList(
		            Student.builder().rollNo(1).firstName("Tom").lastName("Thiew").marks(300.0f).build(),
		            Student.builder().rollNo(2).firstName("Roy").lastName("Gar").marks(950.0f).build(),
		            Student.builder().rollNo(3).firstName("Selena").lastName("Dim").marks(500.0f).build(),
		            Student.builder().rollNo(4).firstName("Rag").lastName("Kid").marks(600.0f).build(),
		            Student.builder().rollNo(5).firstName("Test").lastName("Kid").marks(700.0f).build(),
		            Student.builder().rollNo(6).firstName("Shahrukh").lastName("Khan").marks(800.0f).build(),
		            Student.builder().rollNo(7).firstName("Ranbir").lastName("Kapoor").marks(900.0f).build(),
		            Student.builder().rollNo(8).firstName("Ranveer").lastName("Singh").marks(800.0f).build(),
		            Student.builder().rollNo(9).firstName("Akshay").lastName("Kumar").marks(900.0f).build(),
		            Student.builder().rollNo(10).firstName("Ajay").lastName("Devgan").marks(800.0f).build()
            );



    public static Supplier<List<SuperHero>> superHeroesSupplier = () ->
            Arrays.asList(
                    SuperHero.builder().name("Wade").superName("Deadpool").profession("Street fighter").age(28).canFly(false).build(),
                    SuperHero.builder().name("Bruce").superName("Hulk").profession("Doctor").age(50).canFly(false).build(),
                    SuperHero.builder().name("Steve").superName("Captain America").profession("Solder").age(120).canFly(false).build(),
                    SuperHero.builder().name("Tony").superName("Iron Man").profession("Business man").age(45).canFly(true).build(),
                    SuperHero.builder().name("Peter").superName("Spider Man").profession("Student").age(21).canFly(true).build()
            );





	public static Supplier<List<Employee>> employeeSupplier = () -> {

		Employee rahul = Employee.builder()
				.id(1)
				.firstName("Vaishnavi")
				.lastName("Dhanwade")
				.age(28)
				.noOfChildrens(0)
				.spouse(true)
				.address(Address.builder()
						.id(1)
						.streetAddress("1st main")
						.city("Bangalore")
						.state("Karnataka")
						.country("India")
						.postalCode("560035")
						.build()
				)
				.hobbies(Arrays.asList("Coding", "Reading"))
				.build();

		PhoneNumber myNum = PhoneNumber.builder()
				.id(1)
				.type("Mobile")
				.number("1234567890")
				.employee(rahul)
				.build();

		rahul.setPhoneNumbers(Arrays.asList(myNum));






		Employee aryan = Employee.builder()
				.id(1)
				.firstName("Aryan")
				.lastName("Ghadage")
				.age(28)
				.noOfChildrens(0)
				.spouse(true)
				.address(Address.builder()
						.id(1)
						.streetAddress("A road")
						.city("Pune")
						.state("Maharashtra")
						.country("India")
						.postalCode("411018")
						.build()
				)
				.hobbies(Arrays.asList("Dancing", "Cooking"))
				.build();

		PhoneNumber aryansNumber = PhoneNumber.builder()
				.id(1)
				.type("Mobile")
				.number("1234555555")
				.employee(aryan)
				.build();

		aryan.setPhoneNumbers(Arrays.asList(aryansNumber));


		return Arrays.asList(rahul, aryan);
	};
}
