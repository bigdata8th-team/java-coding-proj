package spring_02_ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageBean{

    //基本值
    private String name;
    private int age;

    //bean对象
    private Computer computer;

    //集合
    private List<String> langs;
    private Set<String> cities;
    private Map<String, Object> score;
    private Properties props;

    public void execute() {
        System.out.println("基本值：");
        System.out.println(name);
        System.out.println(age);

        System.out.println("bean对象：");
        if(computer != null) {
            System.out.println(computer.getMainboard());
            System.out.println(computer.getHdd());
            System.out.println(computer.getRam());
        }

        System.out.println("编程语言：");
        if(langs != null) {
            for(String lang : langs) {
                System.out.println(lang);
            }
        }

        System.out.println("城市：");
        if(cities != null) {
            for(String city : cities) {
                System.out.println(city);
            }
        }

        System.out.println("分数：");
        if(score != null) {
            Set<String> set = score.keySet();
            for(String key : set) {
                System.out.println(
                        key + " : " + score.get(key));
            }
        }

        System.out.println("参数：");
        if(props != null) {
            Set<Object> propKeySet = props.keySet();
            for(Object key : propKeySet) {
                System.out.println(
                        key + " : " + props.getProperty(key.toString()));
            }
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public List<String> getLangs() {
        return langs;
    }
    public void setLangs(List<String> langs) {
        this.langs = langs;
    }
    public Set<String> getCities() {
        return cities;
    }
    public void setCities(Set<String> cities) {
        this.cities = cities;
    }
    public Map<String, Object> getScore() {
        return score;
    }
    public void setScore(Map<String, Object> score) {
        this.score = score;
    }
    public Properties getProps() {
        return props;
    }
    public void setProps(Properties props) {
        this.props = props;
    }
}