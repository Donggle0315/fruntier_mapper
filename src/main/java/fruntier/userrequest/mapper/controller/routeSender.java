package fruntier.userrequest.mapper.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fruntier.userrequest.mapper.domain.LatLng;
import fruntier.userrequest.mapper.domain.VertexDto;

import java.util.ArrayList;
import java.util.List;

public class routeSender {
    private List<VertexDto> list;

    public routeSender() {
        list = new ArrayList<>();
        list.add(new VertexDto("1", new LatLng(37.55506031317844, 126.9369740856605)));
        list.add(new VertexDto("2", new LatLng(37.55142064997161, 126.9376674708789)));
        list.add(new VertexDto("3", new LatLng(37.54916886424626, 126.93902731225636)));
        list.add(new VertexDto("4", new LatLng(37.54999123866213, 126.94400590647393)));
        list.add(new VertexDto("5", new LatLng(37.55258701953517, 126.94595047163881)));
        list.add(new VertexDto("6", new LatLng(37.55662346702948, 126.9459022862972)));
        list.add(new VertexDto("7", new LatLng(37.55644103915624, 126.94123961446108)));
        list.add(new VertexDto("8", new LatLng(37.55496123368169, 126.93703075540618)));
        list.add(new VertexDto("9", new LatLng(37.55506031317844, 126.9369740856605)));
    }

    public List<VertexDto> getList() {
        return list;
    }

    public void setList(List<VertexDto> list) {
        this.list = list;
    }

    public void convertToJSON() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonData = objectMapper.writeValueAsString(this.list);
            // jsonData is your JSON string
        } catch (JsonProcessingException e) {
            // Handle exception
            e.printStackTrace();
        }
    }

}
