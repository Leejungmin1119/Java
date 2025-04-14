package Additional_problems;

public class chater5_12 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "c++");

        System.out.println("이재문의 값은" + dic.get("이재문"));
        System.out.println("황기태의 값은" + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은" + dic.get("황기태"));

    }

}

abstract class PairMap {
    protected String keyArray[];
    protected String valueArray[];

    abstract public String get(String key);

    abstract public void put(String key, String gvalue);

    abstract public void delete(String key);

    abstract public int lenght();

}

class Dictionary extends PairMap {
    int index;

    public Dictionary(int size) {
        this.index = 0;
        this.keyArray = new String[size];
        this.valueArray = new String[size];
    }

    public void put(String key, String gvalue) {
        for (int i = 0; i < index; i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = gvalue;
                break;
            }
        }

        keyArray[index] = key;
        valueArray[index] = gvalue;
        index++;
    }

    public void delete(String key) {
        for (int i = 0; i < index; i++) {
            if (keyArray[i].equals(key)) {
                keyArray[i] = "null";
                valueArray[i] = "null";
            }
        }
    }

    public int lenght() {
        return index;
    }

    public String get(String key) {
        for (int i = 0; i < index; i++) {
            if (keyArray[i].equals(key)) {
                return String.format(" %s", valueArray[i]);
            }
        }
        return " null";
    }

}
