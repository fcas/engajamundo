package controller;

import java.io.Serializable;
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  

import javax.faces.bean.ManagedBean;
  
@SuppressWarnings("serial")
@ManagedBean(name="formPaises")
public class FormPaises implements Serializable{
	
	private List<String> paisesSelecionados;  
	  
    private Map<String,String> paises;  
  
    public FormPaises() {  
        paises = new HashMap<String, String>();  
        paises.put("Afeganistão","Afeganistão");
        		paises.put("África do Sul","África do Sul");
        		paises.put("Akrotiri","Akrotiri");
        		paises.put("Albâniapaises","Albâniapaises");
        		paises.put("Alemanha","Alemanha");
        		paises.put("Andorra","Andorra");
        		paises.put("Angola","Angola");
        		paises.put("Anguila","Anguila");
        		paises.put("Antárctida","Antárctida");
        		paises.put("Antígua e Barbuda","Antígua e Barbuda");
        		paises.put("Antilhas Neerlandesas","Antilhas Neerlandesas");
        		paises.put("Arábia Saudita","Arábia Saudita");
        		paises.put("Arctic Ocean","Arctic Ocean");
        		paises.put("Argélia","Argélia");
        		paises.put("Argentina","Argentina");
        		paises.put("Arménia","Arménia");
        		paises.put("Aruba","Aruba");
        		paises.put("Ashmore and Cartier Islands","Ashmore and Cartier Islands");
        		paises.put("Atlantic Ocean","Atlantic Ocean");
        		paises.put("Áustria","Áustria");
        		paises.put("Austrália","Austrália");
        		paises.put("Azerbaijão","Azerbaijão");
        		paises.put("Baamas","Baamas");
        		paises.put("Bangladeche","Bangladeche");
        		paises.put("Barbados","Barbados");
        		paises.put("Barém","Barém");
        		paises.put("Bélgica","Bélgica");
        		paises.put("Belize","Belize");
        		paises.put("Benim","Benim");
        		paises.put("Bermudas","Bermudas");
        		paises.put("Bielorrússia","Bielorrússia");
        		paises.put("Birmânia","Birmânia");
        		paises.put("Bolívia","Bolívia");
        		paises.put("Bósnia e Herzegovina","Bósnia e Herzegovina");
        		paises.put("Botsuana","Botsuana");
        		paises.put("Brasil","Brasil");
        		paises.put("Brunei","Brunei");
        		paises.put("Bulgária","Bulgária");
        		paises.put("Burquina Faso","Burquina Faso");
        		paises.put("Burúndi","Burúndi");
        		paises.put("Butão","Butão");
        		paises.put("Cabo Verde","Cabo Verde");
        		paises.put("Camarões","Camarões");
        		paises.put("Camboja","Camboja");
        		paises.put("Canadá","Canadá");
        		paises.put("Catar","Catar");
        		paises.put("Cazaquistão","Cazaquistão");
        		paises.put("Chade","Chade");
        		paises.put("Chile","Chile");
        		paises.put("China","China");
        		paises.put("Chipre","Chipre");
        		paises.put("Clipperton Island","Clipperton Island");
        		paises.put("Colômbia","Colômbia");
        		paises.put("Comores","Comores");
        		paises.put("Congo-Brazzaville","Congo-Brazzaville");
        		paises.put("Congo-Kinshasa","Congo-Kinshasa");
        		paises.put("Coral Sea Islands","Coral Sea Islands");
        		paises.put("Coreia do Norte","Coreia do Norte");
        		paises.put("Coreia do Sul","Coreia do Sul");
        		paises.put("Costa do Marfim","Costa do Marfim");
        		paises.put("Costa Rica","Costa Rica");
        		paises.put("Croácia","Croácia");
        		paises.put("Cuba","Cuba");
        		paises.put("Dhekelia","Dhekelia");
        		paises.put("Dinamarca","Dinamarca");
        		paises.put("Domínica","Domínica");
        		paises.put("Egipto","Egipto");
        		paises.put("Emiratos Árabes Unidos","Emiratos Árabes Unidos");
        		paises.put("Equador","Equador");
        		paises.put("Eritreia","Eritreia");
        		paises.put("Eslováquia","Eslováquia");
        		paises.put("Eslovénia","Eslovénia");
        		paises.put("Espanha","Espanha");
        		paises.put("Estados Unidos","Estados Unidos");
        		paises.put("Estónia","Estónia");
        		paises.put("Etiópia","Etiópia");
        		paises.put("Faroé","Faroé");
        		paises.put("Fiji","Fiji");
        		paises.put("Filipinas","Filipinas");
        		paises.put("Finlândia","Finlândia");
        		paises.put("França","França");
        		paises.put("Gabão","Gabão");
        		paises.put("Gâmbia","Gâmbia");
        		paises.put("Gana","Gana");
        		paises.put("Gaza Strip","Gaza Strip");
        		paises.put("Geórgia","Geórgia");
        		paises.put("Geórgia do Sul e Sandwich do Sul","Geórgia do Sul e Sandwich do Sul");
        		paises.put("Gibraltar","Gibraltar");
        		paises.put("Granada","Granada");
        		paises.put("Grécia","Grécia");
        		paises.put("Gronelândia","Gronelândia");
        		paises.put("Guame","Guame");
        		paises.put("Guatemala","Guatemala");
        		paises.put("Guernsey","Guernsey");
        		paises.put("Guiana","Guiana");
        		paises.put("Guiné","Guiné");
        		paises.put("Guiné Equatorial","Guiné Equatorial");
        		paises.put("Guiné-Bissau","Guiné-Bissau");
        		paises.put("Haiti","Haiti");
        		paises.put("Honduras","Honduras");
        		paises.put("Hong Kong","Hong Kong");
        		paises.put("Hungria","Hungria");
        		paises.put("Iémen","Iémen");
        		paises.put("Ilha Bouvet","Ilha Bouvet");
        		paises.put("Ilha do Natal","Ilha do Natal");
        		paises.put("Ilha Norfolk","Ilha Norfolk");
        		paises.put("Ilhas Caimão","Ilhas Caimão");
        		paises.put("Ilhas Cook","Ilhas Cook");
        		paises.put("Ilhas dos Cocos","Ilhas dos Cocos");
        		paises.put("Ilhas Falkland","Ilhas Falkland");
        		paises.put("Ilhas Heard e McDonald","Ilhas Heard e McDonald");
        		paises.put("Ilhas Marshall","Ilhas Marshall");
        		paises.put("Ilhas Salomão","Ilhas Salomão");
        		paises.put("Ilhas Turcas e Caicos","Ilhas Turcas e Caicos");
        		paises.put("Ilhas Virgens Americanas","Ilhas Virgens Americanas");
        		paises.put("Ilhas Virgens Britânicas","Ilhas Virgens Britânicas");
        		paises.put("Índia","Índia");
        		paises.put("Indian Ocean","Indian Ocean");
        		paises.put("Indonésia","Indonésia");
        		paises.put("Irão","Irão");
        		paises.put("Iraque","Iraque");
        		paises.put("Irlanda","Irlanda");
        		paises.put("Islândia","Islândia");
        		paises.put("Israel","Israel");
        		paises.put("Itália","Itália");
        		paises.put("Jamaica","Jamaica");
        		paises.put("Jan Mayen","Jan Mayen");
        		paises.put("Japão","Japão");
        		paises.put("Jersey","Jersey");
        		paises.put("Jibuti","Jibuti");
        		paises.put("Jordânia","Jordânia");
        		paises.put("Kuwait","Kuwait");
        		paises.put("Laos","Laos");
        		paises.put("Lesoto","Lesoto");
        		paises.put("Letónia","Letónia");
        		paises.put("Líbano","Líbano");
        		paises.put("Libéria","Libéria");
        		paises.put("Líbia","Líbia");
        		paises.put("Listenstaine","Listenstaine");
        		paises.put("Lituânia","Lituânia");
        		paises.put("Luxemburgo","Luxemburgo");
        		paises.put("Macau","Macau");
        		paises.put("Macedónia","Macedónia");
        		paises.put("Madagáscar","Madagáscar");
        		paises.put("Malásia","Malásia");
        		paises.put("Malávi","Malávi");
        		paises.put("Maldivas","Maldivas");
        		paises.put("Mali","Mali");
        		paises.put("Malta","Malta");
        		paises.put("Man, Isle of","Man, Isle of");
        		paises.put("Marianas do Norte","Marianas do Norte");
        		paises.put("Marrocos","Marrocos");
        		paises.put("Maurícia","Maurícia");
        		paises.put("Mauritânia","Mauritânia");
        		paises.put("Mayotte","Mayotte");
        		paises.put("México","México");
        		paises.put("Micronésia","Micronésia");
        		paises.put("Moçambique","Moçambique");
        		paises.put("Moldávia","Moldávia");
        		paises.put("Mónaco","Mónaco");
        		paises.put("Mongólia","Mongólia");
        		paises.put("Monserrate","Monserrate");
        		paises.put("Montenegro","Montenegro");
        		paises.put("Mundo","Mundo");
        		paises.put("Namíbia","Namíbia");
        		paises.put("Nauru","Nauru");
        		paises.put("Navassa Island","Navassa Island");
        		paises.put("Nepal","Nepal");
        		paises.put("Nicarágua","Nicarágua");
        		paises.put("Níger","Níger");
        		paises.put("Nigéria","Nigéria");
        		paises.put("Niue","Niue");
        		paises.put("Noruega","Noruega");
        		paises.put("Nova Caledónia","Nova Caledónia");
        		paises.put("Nova Zelândia","Nova Zelândia");
        		paises.put("Omã","Omã");
        		paises.put("Pacific Ocean","Pacific Ocean");
        		paises.put("Países Baixos","Países Baixos");
        		paises.put("Palau","Palau");
        		paises.put("Panamá","Panamá");
        		paises.put("Papua-Nova Guiné","Papua-Nova Guiné");
        		paises.put("Paquistão","Paquistão");
        		paises.put("Paracel Islands","Paracel Islands");
        		paises.put("Paraguai","Paraguai");
        		paises.put("Peru","Peru");
        		paises.put("Pitcairn","Pitcairn");
        		paises.put("Polinésia Francesa","Polinésia Francesa");
        		paises.put("Polónia","Polónia");
        		paises.put("Porto Rico","Porto Rico");
        		paises.put("Portugal","Portugal");
        		paises.put("Quénia","Quénia");
        		paises.put("Quirguizistão","Quirguizistão");
        		paises.put("Quiribáti","Quiribáti");
        		paises.put("Reino Unido","Reino Unido");
        		paises.put("República Centro-Africana","República Centro-Africana");
        		paises.put("República Checa","República Checa");
        		paises.put("República Dominicana","República Dominicana");
        		paises.put("Roménia","Roménia");
        		paises.put("Ruanda","Ruanda");
        		paises.put("Rússia","Rússia");
        		paises.put("Salvador","Salvador");
        		paises.put("Samoa","Samoa");
        		paises.put("Samoa Americana","Samoa Americana");
        		paises.put("Santa Helena","Santa Helena");
        		paises.put("Santa Lúcia","Santa Lúcia");
        		paises.put("São Cristóvão e Neves","São Cristóvão e Neves");
        		paises.put("São Marinho","São Marinho");
        		paises.put("São Pedro e Miquelon","São Pedro e Miquelon");
        		paises.put("São Tomé e Príncipe","São Tomé e Príncipe");
        		paises.put("São Vicente e Granadinas","São Vicente e Granadinas");
        		paises.put("Sara Ocidental","Sara Ocidental");
        		paises.put("Seicheles","Seicheles");
        		paises.put("Senegal","Senegal");
        		paises.put("Serra Leoa","Serra Leoa");
        		paises.put("Sérvia","Sérvia");
        		paises.put("Singapura","Singapura");
        		paises.put("Síria","Síria");
        		paises.put("Somália","Somália");
        		paises.put("Southern Ocean","Southern Ocean");
        		paises.put("Spratly Islands","Spratly Islands");
        		paises.put("Sri Lanca","Sri Lanca");
        		paises.put("Suazilândia","Suazilândia");
        		paises.put("Sudão","Sudão");
        		paises.put("Suécia","Suécia");
        		paises.put("Suíça","Suíça");
        		paises.put("Suriname","Suriname");
        		paises.put("Svalbard e Jan Mayen","Svalbard e Jan Mayen");
        		paises.put("Tailândia","Tailândia");
        		paises.put("Taiwan","Taiwan");
        		paises.put("Tajiquistão","Tajiquistão");
        		paises.put("Tanzânia","Tanzânia");
        		paises.put("Território Britânico do Oceano Índico","Território Britânico do Oceano Índico");
        		paises.put("Territórios Austrais Franceses","Territórios Austrais Franceses");
        		paises.put("Timor Leste","Timor Leste");
        		paises.put("Togo","Togo");
        		paises.put("Tokelau","Tokelau");
        		paises.put("Tonga","Tonga");
        		paises.put("Trindade e Tobago","Trindade e Tobago");
        		paises.put("Tunísia","Tunísia");
        		paises.put("Turquemenistão","Turquemenistão");
        		paises.put("Turquia","Turquia");
        		paises.put("Tuvalu","Tuvalu");
        		paises.put("Ucrânia","Ucrânia");
        		paises.put("Uganda","Uganda");
        		paises.put("União Europeia","União Europeia");
        		paises.put("Uruguai","Uruguai");
        		paises.put("Usbequistão","Usbequistão");
        		paises.put("Vanuatu","Vanuatu");
        		paises.put("Vaticano","Vaticano");
        		paises.put("Venezuela","Venezuela");
        		paises.put("Vietname","Vietname");
        		paises.put("Wake Island","Wake Island");
        		paises.put("Wallis e Futuna","Wallis e Futuna");
        		paises.put("West Bank","West Bank");
        		paises.put("Zâmbia","Zâmbia");
        		paises.put("Zimbabué","Zimbabué");
    }  
  
    public List<String> getSelectedPaises() {  
        return paisesSelecionados;  
    }  
    public void setSelectedPaises(List<String> selectedMovies) {  
        this.paisesSelecionados = selectedMovies;  
    }  
  
    public Map<String, String> getPaises() {  
        return paises;  
    }  

}