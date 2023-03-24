package service.Impl;

import db.DateBase;
import model.Group;
import service.GroupService;

import java.util.Comparator;
import java.util.List;

public class GroupServiceImpl implements GroupService {
    DateBase dateBase = new DateBase();
    @Override
    public String addNewGroup(Group group) {
        dateBase.getGroups().add(group);
        return "Successfully ne group added";
    }

    @Override
    public String getGroupById(int id) {
         return "Successfully found";
    }

    @Override
    public List<Group> getAllGroups() {
        return dateBase.getGroups();
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        dateBase.getGroups().stream()
                .filter(g->g.getId()==id)
                .forEach(group -> group.setName(groupName));
        return "success";
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        if (ascDesc.equalsIgnoreCase("asc")){
            dateBase.getGroups().stream()
                    .sorted((x,y)-> {y.getYear() > year;
                    })
                    .toList()
                    .forEach(System.out::println);
        }else if (ascDesc.equalsIgnoreCase("desc")){
            dateBase.getGroups().stream()
                    .sorted((x,y)-> x.getYear())
                    .toList()
                    .forEach(System.out::println);
        }
        return dateBase.getGroups();
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        if (ascDesc.equalsIgnoreCase("asc")){
            dateBase.getGroups().stream()
                    .sorted((x,y)->y.getYear())
                    .toList()
                    .forEach(System.out::println);
        }else if (ascDesc.equalsIgnoreCase("desc")){
            dateBase.getGroups().stream()
                    .sorted((x,y)-> x.getYear())
                    .toList()
                    .forEach(System.out::println);
        }
        return dateBase.getGroups();
    }

    @Override
    public void deleteGroupById(int id) {
        dateBase.getGroups().stream()
                .filter(x->x.getId()==id)
                .forEach(x-> getAllGroups().remove(x));



    }
}
