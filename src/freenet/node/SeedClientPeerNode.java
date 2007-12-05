/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package freenet.node;

import freenet.io.comm.PeerParseException;
import freenet.io.comm.ReferenceSignatureVerificationException;
import freenet.support.SimpleFieldSet;

/**
 * Seed node's representation of a client node connecting in order to announce.
 * @author toad
 */
public class SeedClientPeerNode extends PeerNode {

	public SeedClientPeerNode(SimpleFieldSet fs, Node node2, NodeCrypto crypto, PeerManager peers, boolean fromLocal, OutgoingPacketMangler mangler) throws FSParseException, PeerParseException, ReferenceSignatureVerificationException {
		super(fs, node2, crypto, peers, fromLocal, mangler, true);
	}

	public PeerNodeStatus getStatus() {
		return new PeerNodeStatus(this);
	}

	public boolean isOpennet() {
		return false; // Not exactly
	}

	public boolean isSearchable() {
		return false; // We may be connected to the same node as a seed and as a regular connection.
	}

	public boolean equals(Object o) {
		// Only equal to seednode of its own type.
		// Different to an OpennetPeerNode with the same identity!
		if(o instanceof SeedClientPeerNode) {
			return super.equals(o);
		} else return false;
	}
	
	public void onSuccess(boolean insert, boolean ssk) {
		// Ignore
	}
	
	public boolean isRoutingCompatible() {
		return false;
	}

	public boolean canAcceptAnnouncements() {
		return true;
	}

	public boolean recordStatus() {
		return false;
	}
}
