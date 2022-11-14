package com.krabs.sorting; // VA čIA PAKEITIMA PADARIAUUUU
// Sitas pakeitimas vyko develop branche.
// dar vienas pakeitimas in new branch "feature/new-feature"

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component // --deklaruojam kad BinarySearchImpl yra a bean.
@Service // test
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImplSB {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); // renkames slf4j logger.

	@Autowired // sakom kad BinarySearchImpl depends on sortAlgorithm a.k.a sortAlgorithm is a
				// dependency for BinarySearchImpl
	// kad BinarySearchImpl veiktu, reikia sortint, todel priklauso nuo sort,
	// @Autowired padaro
	// BinarySearchImpl dependant on SortAlgorithm .

	@Qualifier("quick")
	private SortAlgorithmSB sortAlgorithmSB;// sortAlgorithm;
	


	public void setSortAlgorithm(SortAlgorithmSB sortAlgorithmSB) {
		this.sortAlgorithmSB = sortAlgorithmSB;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithmSB);
		//Implementing Sorting logic
		//Search the array
		return 3; //Return the result
	}

	@PostConstruct
	public void postConstruct() { // callina iskart po susikurimo
		logger.info("postConstruct");
	}

	@PreDestroy
	public void preDestroy() { // callina pries pat sunaikinima
		logger.info("preDestroy");
	}
}