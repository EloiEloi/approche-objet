package tp5.entities;

import tp6.ISurface;

public class Maison implements ISurface {
	Piece[] tabPiecesDansMaison = new Piece[0];

	public void ajouterPiece(Piece... pieces) {

		Piece[] tabTemp = new Piece[pieces.length + tabPiecesDansMaison.length];

		for (int i = 0; i < tabPiecesDansMaison.length; i++) {
			tabTemp[i] = tabPiecesDansMaison[i];
		}
		for (int i = tabPiecesDansMaison.length; i < tabTemp.length; i++) {
			tabTemp[i] = pieces[i];
		}
		tabPiecesDansMaison = tabTemp;
	}

	public double calculerSurface() {
		double maSuperficie = 0;
		for (int i = 0; i < tabPiecesDansMaison.length; i++) {
			maSuperficie += tabPiecesDansMaison[i].getSuperficie();
		}
		return maSuperficie;

	}

	public double getSuperficieParEtage(int MonEtage) {
		double maSuperficie = 0;
		for (int i = 0; i < tabPiecesDansMaison.length; i++) {
			if (tabPiecesDansMaison[i].getNumEtage() == MonEtage) {
				maSuperficie += tabPiecesDansMaison[i].getSuperficie();
			}

		}
		return maSuperficie;

	}

	public double getSuperficieParTypePiece(String maPiece) {
		double maSuperficie = 0;
		for (int i = 0; i < tabPiecesDansMaison.length; i++) {
			if (maPiece.equals(tabPiecesDansMaison[i].getClass().getSimpleName())) {
				maSuperficie += tabPiecesDansMaison[i].getSuperficie();
			}

		}
		return maSuperficie;
	}

	public int getNbPiecesPartypePiece(String maPiece) {
		int nbPieces = 0;
		for (int i = 0; i < tabPiecesDansMaison.length; i++) {
			if (maPiece.equals(tabPiecesDansMaison[i].getClass().getSimpleName())) {
				nbPieces++;
			}

		}
		return nbPieces;
	}

}
