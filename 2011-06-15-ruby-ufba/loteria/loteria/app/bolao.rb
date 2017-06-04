class Bolao

  def initialize(jogos)
    @jogos = jogos
  end

  def valido?
    validar_quantidade_jogos
  end

  private

  def validar_quantidade_jogos
    @jogos.size > 0
  end

end