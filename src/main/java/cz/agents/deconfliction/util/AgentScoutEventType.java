package cz.agents.deconfliction.util;import cz.agents.alite.common.event.EventType;public enum AgentScoutEventType implements EventType {    STEP,    MOVE, INTERPOLATED_MOVE, TURN, SENSE_POSITION, SENSE_DIRECTION,    WALK, SENSE_WALL_HIT, SENSE_PERSON_HIT,    GO_TO_WAYPOINT, SENSE_WAYPOINT, WAYPOINT_REACHED,    SENSE_POSITION_ORIENTATION,    MOVE_STARTED, CLOCK_TICK, SENSE_MOVE_STARTED, SENSE_ALARM, SENSE_PATATTACK}