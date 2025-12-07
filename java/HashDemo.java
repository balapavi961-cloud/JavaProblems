//import javax.swing.text.html.parser.Entity;

class HashMap{
    private Entity[] entities;
    public HashMap(){
          entities = new Entity[100] ;
    }
    public class Entity{
        String key;
        String value;
        Entity(String key, String value){
            this.key=key;
            this.value=value;
        }
    }
    public void put(String key,String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash]=new Entity(key,value);
    }
    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash]!= null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }
}
public class HashDemo {
    public static void main(String[] args) {
        HashMap hash = new HashMap();
        hash.put("30","Bala");
        hash.put("20","maddy");
        hash.put("56","sam");
        hash.put("45","Chan");
        hash.remove("30");
        System.out.println(hash.get("30"));
        System.out.println(hash.get("20"));
        System.out.println(hash.get("45"));
        System.out.println(hash.get("1"));
    }
}
