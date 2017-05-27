class Forca {
	def forcaArray = []

	def Forca(String forcaFile) {
		def lines = new File(forcaFile).readLines()	
		11.times { i ->
			def strForca = ""
			7.times { strForca += lines[i*7+it]+"\n" }
			forcaArray << strForca
		}
	}

	def getForca(int tentativa) {
		return forcaArray[tentativa]
	}
}
