package pers.mzy.football.footballteam.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author (作者):mf-mazhenyu
 * @package pers.mzy.football.footballteam.entities
 * @title 文件名：TeamMember
 * @date 日期：2019/12/23 9:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class TeamMember implements Serializable {
    private Long memberId;
    private String name;
    private Integer age;
}
