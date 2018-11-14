
public class publicformat {

//Setter and getter
    private String number,name, fielid,rtg, fed ,Ctyclub;

    public publicformat(String number, String name, String fieldid, String fed, String rtg, String Ctyclub) {

        this.number=number;
        this.name = name;
        this.fielid = fieldid;
        this.fed = fed;
        this.rtg = rtg;
        this.Ctyclub = Ctyclub;
    }

    public String getNo() {
        return number;
    }

    public void setNo(String no)
    {
        this.number = no;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFieldid(

    ) {
        return fielid;
    }

    public void setFieldid(String fieldid)
    {
        this.fielid = fieldid;
    }

    public String getRtg() {
        return rtg;
    }

    public void setRtg(String rtg) {
        this.rtg = rtg;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }

    public String getClub() {
        return Ctyclub;
    }

    public void setClub(String club) {
        this.Ctyclub = club;
    }
}
