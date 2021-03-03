/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

/**
 *
 * @author ADMIN
 */
public class Wekapro {

    /**
     * @param args the command line arguments
     */
   static void main(String[] args) throws Exception {
//        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel
//        ("C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
//        System.out.println(model);
//       model.saveData("D:\\Data\\iris.arff");
//        model.saveData2CSV("E:\\\\iris_CSV.csv");

    prioriModel model = new MyAprioriModel(
                "C:\\Program Files\\Weka-3-8-5\\data\\weather.numeric.arff" ,
                  "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
                "-R 2-3 ");
    el.mineAssociationRules();
    tem.out.println(model);
           
    }
    
}
