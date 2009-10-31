require 'rubygems'
require 'spec'

def geraPrimos(num)
	lista = (2..num).to_a
	lista.each do |elemento| 
		excluirMultiplos(elemento,lista)
	end
	lista
end

def excluirMultiplos(n,lista)
	for i in 2..(lista.size/2+1)
		lista.delete(i*n)
	end
end

describe "prime generation" do
	
	it "should work for 2" do
		primos = geraPrimos(2)
		primos.should == [2]
	end

	it "should work for 3" do
		primos = geraPrimos(3)
		primos.should == [2,3]
	end

	it "should work for 4" do
		primos = geraPrimos(4)
		primos.should == [2,3]
	end

	it "should work for 5" do
		primos = geraPrimos(5)
		primos.should == [2,3,5]
	end

	it "should work for 6" do
		primos = geraPrimos(6)
		primos.should == [2,3,5]
	end

	it "should work for 8" do
		primos = geraPrimos(8)
		primos.should == [2,3,5,7]
	end

	it "should work for 1000" do
		primos = geraPrimos(71)
		(2..500).each do |n|
			primos.include?(2*n).should == false
			primos.include?(3*n).should == false
			primos.include?(5*n).should == false
			primos.include?(7*n).should == false
		end
	end


	
end