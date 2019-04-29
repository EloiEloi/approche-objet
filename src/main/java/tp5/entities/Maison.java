package tp5.entities;

import java.util.ArrayList;

import tp6.ISurface;

public class Maison implements ISurface {

	ArrayList<Piece> arrayPiecesDansMaison = new ArrayList<>();

	public void ajouterPiece(Piece piece) {

		arrayPiecesDansMaison.add(piece);
	}

	public double calculerSurface() {
		double maSuperficie = 0;
		for (int i = 0; i < arrayPiecesDansMaison.size(); i++) {
			maSuperficie += arrayPiecesDansMaison.get(i).getSuperficie();
		}
		return maSuperficie;

	}

	public double getSuperficieParEtage(int MonEtage) {
		double maSuperficie = 0;
		for (int i = 0; i < arrayPiecesDansMaison.size(); i++) {
			if (arrayPiecesDansMaison.get(i).getNumEtage() == MonEtage) {
				maSuperficie += arrayPiecesDansMaison.get(i).getSuperficie();
			}

		}
		return maSuperficie;

	}

	public double getSuperficieParTypePiece(String maPiece) {
		double maSuperficie = 0;
		for (int i = 0; i < arrayPiecesDansMaison.size(); i++) {
			if (maPiece.equals(arrayPiecesDansMaison.get(i).getClass().getSimpleName())) {
				maSuperficie += arrayPiecesDansMaison.get(i).getSuperficie();
			}

		}
		return maSuperficie;
	}

	public int getNbPiecesPartypePiece(String maPiece) {
		int nbPieces = 0;
		for (int i = 0; i < arrayPiecesDansMaison.size(); i++) {
			if (maPiece.equals(arrayPiecesDansMaison.get(i).getClass().getSimpleName())) {
				nbPieces++;
			}

		}
		return nbPieces;
	}

}
