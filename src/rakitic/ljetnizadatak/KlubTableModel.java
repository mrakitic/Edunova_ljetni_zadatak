/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakitic.ljetnizadatak;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Borna
 */
public class KlubTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL=-1;
    public static final int SIFRA_COL=-2;
    public static final int NAZIV_COL=0;
    public static final int IMESTADIONA_COL=1;
    public static final int GRAD_COL=2;
    
    
    private static final String[] nazivStupaca = {
        "Naziv kluba","Ime stadiona","Grad"
    };
    
    private List<Klub> klubovi;
    public KlubTableModel(List<Klub> tempKlubovi){
        klubovi=tempKlubovi;
    }
    

    @Override
    public int getRowCount() {
       return klubovi.size();
    }

    @Override
    public int getColumnCount() {
        return nazivStupaca.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Klub klub = klubovi.get(row);
        switch(column){
           
            case SIFRA_COL:
                return klub.getSifra();
            case NAZIV_COL:
                return klub.getNazivKluba();
            case IMESTADIONA_COL:
                return klub.getImeStadiona();
            case GRAD_COL:
                return klub.getGrad();
            case OBJECT_COL:
                return klub;
                default:
                    return klub.getNazivKluba();
                    
                
        }
        
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0,columnIndex).getClass();
    }

    @Override
    public String getColumnName(int column) {
        return nazivStupaca[column];
    }
    
    
    
    
    
    
    
}
