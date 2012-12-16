package engine;

import knowledge.KnowledgeBuilder;

public class EngineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//boolean panic = false;
		KnowledgeBuilder kbuilder = new KnowledgeBuilder();
		System.out.println(System.getProperty("user.dir"));
		//panic = true;
		kbuilder.add("C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\test\\testRule1.txt");
	}
}
