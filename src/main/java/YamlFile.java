import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class YamlFile {
    public static String defaultFileName = "test.yaml";

    public static Map<String, Object> getYamlFileContent() {
        return getYamlFileContent(defaultFileName);
    }

    public static Map<String, Object> getYamlFileContent(String fileName) {
        Yaml yaml = new Yaml();

        InputStream inputStream = YamlFile.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        return yaml.load(inputStream);
    }

    public static void printYamlFileContent() {
        printYamlFileContent(defaultFileName);
    }

    public static void printYamlFileContent(String fileName) {
        Map<String, Object> obj = getYamlFileContent(fileName);

        System.out.println(obj);
    }
}