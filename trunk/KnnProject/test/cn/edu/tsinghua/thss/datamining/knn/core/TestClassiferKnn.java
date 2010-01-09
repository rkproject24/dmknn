package cn.edu.tsinghua.thss.datamining.knn.core;

import org.junit.BeforeClass;
import org.junit.Test;

import cn.edu.tsinghua.thss.datamining.knn.model.DataSet;
import cn.edu.tsinghua.thss.datamining.knn.model.Instance;

public class TestClassiferKnn {
	private static ClassifierKnn classifier;

	@BeforeClass
	public static void setUpBeforClass() {
		ArffTransformer arffTrans = new ArffTransformer("c:/training.arff");
		DataSet ds = arffTrans.getDatasetFromFile();
		classifier = new ClassifierKnnDiscrete(1, ds);
	}

	@Test
	public void testClassifyNewInstance() {
		System.out.println(classifier.getTrainingset());
	}
}
