package com.cnmar.benxiao_mvp.component.process.model;

import java.io.Serializable;

/** 成品工序-班组 */
@SuppressWarnings("serial")
public class ProcessProductTeam implements Serializable {

	private int id;
	private int processId;
	private int teamId;

	public ProcessProductTeam() {

	}

	public ProcessProductTeam(int processId, int teamId) {
		this.processId = processId;
		this.teamId = teamId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

}
