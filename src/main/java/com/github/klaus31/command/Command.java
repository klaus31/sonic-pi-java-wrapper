package com.github.klaus31.command;

public interface Command {

	Command IN_THREAD_DO = () -> "in_thread do";
	Command END = () -> "end";

	String getSongLine();
}
