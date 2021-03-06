package com.dao;

import com.pojo.Club;

public interface ClubInfroDao {
    // 根据俱乐部的id查询俱乐部所有信息
    public Club getClubInfroById(Integer clubId);

    // 添加新的俱乐部 返回当前添加的club_id
    public int addNewClub(Club club);

    // 根据id删除俱乐部
    public int deleteClub(Integer clubId);

    // 根据id更新俱乐部信息
    public int updateClub(Integer clubId);
}
