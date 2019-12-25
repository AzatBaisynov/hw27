package places;

public abstract class AbstractPlace {
    private String name;
    private int peopleCount;
    private District[] districts;
    private String districtHead;

    public AbstractPlace(District[] districts, String name, int peopleCount, String districtHead) {
        this.districts = districts;
        this.name = name;
        this.peopleCount = peopleCount;
        this.districtHead = districtHead;
    }

    public AbstractPlace(String name, int peopleCount) {
        this.name = name;
        this.peopleCount = peopleCount;
    }

    public AbstractPlace(int peopleCount, String name, String districtHead) {
        this.peopleCount = peopleCount;
        this.name = name;
        this.districtHead = districtHead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getDistrictHead() {
        return districtHead;
    }

    public District findByHead(String name, District[] districts) {
        for (int i = 0; i < districts.length; i++) {
            if (districts[i].getDistrictHead().equals(name)) {
                return districts[i];
            }
        }
        return null;
    }
}

