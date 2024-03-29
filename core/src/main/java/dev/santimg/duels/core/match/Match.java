package dev.santimg.duels.core.match;

import java.util.List;

import org.bukkit.entity.Player;

import dev.santimg.duels.core.arena.Arena;

public interface Match {

	/**
	 * Starts the {@link Match} starting countdown
	 */
	void startCountdown();

	/**
	 * Starts the {@link Match}
	 */
	void start();

	/**
	 * Finishes the {@link Match}
	 * 
	 * @param winner the winner of the {@link Match}
	 */
	void finish(Player winner);

	/**
	 * Cancels the {@link Match}
	 */
	void cancel();

	/**
	 * Adds a spectator to the {@link Match}
	 * 
	 * @param player the {@link Player} to add
	 */
	void addSpectator(Player player);

	/**
	 * Removes a spectator from the {@link Match}
	 * 
	 * @param player the {@link Player} to remove
	 */
	void removeSpectator(Player player);

	/**
	 * Gets the {@link Arena} used in the {@link Match}
	 * 
	 * @return the {@link Arena} instance
	 */
	Arena getArena();

	/**
	 * Gets the {@link Player}s participating in the {@link Match}
	 * 
	 * @return the {@link Player}s participating
	 */
	Player[] getParticipants();

	/**
	 * Gets the {@link MatchState} of the {@link Match}
	 * 
	 * @return the {@link Match}'s {@link MatchState}
	 */
	MatchState getState();

	/**
	 * Gets all {@link Player}s spectating the {@link Match}
	 * 
	 * @return a {@link List} with the {@link Player}s instances
	 */
	List<Player> getSpectators();

	/**
	 * Checks if a {@link Player} is spectating the {@link Match}
	 * 
	 * @param player the {@link Player}
	 * @return true if it's spectating
	 */
	boolean isSpectating(Player player);

	/**
	 * Gets the {@link Match} play time
	 * 
	 * @return the play time in seconds
	 */
	int getPlayTimeSeconds();

	static enum MatchState {

		NONE, STARTING, PLAYING, TERMINATED;
	}
}
