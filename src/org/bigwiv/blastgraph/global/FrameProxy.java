/*
 * BlastGraph: a comparative genomics tool
 * Copyright (C) 2013  Yanbo Ye (yeyanbo289@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.bigwiv.blastgraph.global;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameProxy {
	private JFrame proxiedFrame;
	
	public void setFrame(JFrame frame){
		this.proxiedFrame = frame;
	}
	
	public JFrame getFrame(){
		return proxiedFrame;
	}
	
	public void showError(String message) {
		Global.WORK_STATUS.setError(message);
		JOptionPane.showMessageDialog(proxiedFrame, message, "Error",
				JOptionPane.ERROR_MESSAGE);
	}
}
