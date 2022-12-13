package src.java.gd.rf.jsgames;

import src.java.gd.rf.jsgames.assets.Neuron;

public class Main {
    public static void main(String[] args) {
        double[] in = new double[3];
        in[0] = 1.2;
        in[1] = 5.1;
        in[2] = 2.1;
        double[] weights = new double[3];
        weights[0] = 3.1;
        weights[1] = 2.1;
        weights[2] = 8.7;
    
        double bias = 3;
        Neuron n = new Neuron(in, weights,bias);
        System.out.println(n.out());
    }

}
