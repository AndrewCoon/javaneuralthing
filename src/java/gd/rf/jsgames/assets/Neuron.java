package src.java.gd.rf.jsgames.assets;

public class Neuron {
    private double[] inputs;
    private double[] weights;
    private double bias;
    
    public Neuron(double[] in, double[] wei, double bia) {
        this.inputs = in;
        this.weights = wei;
        this.bias = bia;
    }

    public double out() {
        double tot = 0;
        for (int i = 0; i < inputs.length; i++) {
            tot += inputs[i]*weights[i];
        }
        tot += bias;
        return tot;
        // return inputs[0]*weights[0] + inputs[1]*weights[1] + inputs[2]*weights[2] + bias;
    }
}
