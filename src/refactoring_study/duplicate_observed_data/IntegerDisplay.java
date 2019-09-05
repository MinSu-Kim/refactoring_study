package refactoring_study.duplicate_observed_data;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import refactoring_study.duplicate_observed_data.Graph.GraphType;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener, ValueListener {

	private JPanel contentPane;

	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexadecimal;
	private JButton btnIncrement;
	private JButton btnDecrement;
	
	private Graph circlePanel;
	private Graph rectPanel;
	
	private Value value;

	
	public IntegerDisplay() {
        initComponent();
        value = new Value(0);
        value.addValueListener(this);
        value.addValueListener(circlePanel);
        value.addValueListener(rectPanel);
	}

	private void initComponent() {
		circlePanel = Graph.createGraph(GraphType.CIRCLE, 100, 100);
		rectPanel = Graph.createGraph(GraphType.RECTANGLE, 100, 50);
		
		setTitle("IntegerDisplay");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
        
		contentPane.add(circlePanel, BorderLayout.CENTER);
		contentPane.add(rectPanel, BorderLayout.SOUTH);
		
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 2, 0, 0));
        contentPane.add(mainPanel, BorderLayout.NORTH);
        
        JLabel titleOctal = new JLabel("Octal:");
        mainPanel.add(titleOctal);
        
        lblOctal = new JLabel("0");
        mainPanel.add(lblOctal);
        
        JLabel titleDecimal = new JLabel("Decimal:");
        mainPanel.add(titleDecimal);
        lblDecimal = new JLabel("0");
        mainPanel.add(lblDecimal);
        
        JLabel titleHexadecimal = new JLabel("Hexadecimal:");
        mainPanel.add(titleHexadecimal);
        
        lblHexadecimal = new JLabel("0");
        mainPanel.add(lblHexadecimal);
        
        btnIncrement = new JButton("+");
        btnIncrement.addActionListener(this);
        mainPanel.add(btnIncrement);
        
        btnDecrement = new JButton("-");
        btnDecrement.addActionListener(this);
        mainPanel.add(btnDecrement);
	}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnIncrement) {
            setValue(value.getValue() +1);
        }
        if (e.getSource()==btnDecrement) {
            setValue(value.getValue()-1);
        }
    }

    private void setValue(int value) {
        this.value.setValue(value);
    }

    public int getValue() {
        return value.getValue();
    }

	@Override
	public void valueChanger(ValueChangeEvent e) {
		if (e.getSource() == value) {
			lblOctal.setText(Integer.toOctalString(value.getValue()));
	        lblDecimal.setText(Integer.toString(value.getValue()));
	        lblHexadecimal.setText(Integer.toHexString(value.getValue()));
		}
	}
}
