package fruntier.userrequest.mapper.domain;

public class VertexDto {
    private String title;
    private LatLng latlng;

    public VertexDto(String title, LatLng latlng) {
        this.title = title;
        this.latlng = latlng;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LatLng getLatlng() {
        return latlng;
    }

    public void setLatlng(LatLng latlng) {
        this.latlng = latlng;
    }

    @Override
    public String toString() {
        return this.title + " : " + getLatlng();
    }
}
