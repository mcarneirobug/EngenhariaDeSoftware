
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonJacksonMapMapping {

	private static final String ARQ = "c://Users//Matheus//eclipse-workspace//JsonJacksonMapMappingDemo//map.json";
	
	public static void main(String[] args) {
		
		toJSON(ARQ);
		fromJSON(ARQ);
		System.exit(0);
	}
	
	public static Map<String, Object> fromJSON(String nomeArquivo) {
		ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> mapObject = new HashMap<String, Object>();

        try {
            File jsonFile = new File(nomeArquivo);
            mapObject = mapper.readValue(jsonFile,
                    new TypeReference<Map<String, Object>>() {
                    });

            System.out.println("Nome: " + mapObject.get("nome"));
            System.out.println("Cidade: " + mapObject.get("cidade"));
            System.out.println("Telefone: " + mapObject.get("telefone"));
            System.out.print("Amigos: ");

            @SuppressWarnings("unchecked")
			List<String> list = (List<String>) mapObject.get("amigos");

            for (String name : list) {
                System.out.print(name + " ");
            }
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }catch (JsonMappingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return mapObject;
    }
	
	public static void toJSON(String nomeArquivo) {

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> carMap = new HashMap<String, Object>();

        carMap.put("Carro", "Audi");
        carMap.put("Preco", "30000");
        carMap.put("Modelo", "2010");

        List<String> colors = new ArrayList<String>();
        colors.add("Grey");
        colors.add("White");
        colors.add("Black");

        carMap.put("colors", colors);

        /**
         * Converter map para Json
         */

        try {
            mapper.writeValue(new File("result.json"), carMap);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}