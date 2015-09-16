require 'spec_helper'

describe Pong do 

	describe '.start_game' do
		it 'should not start without 2 players' do 
			Pong.start_game 
		end
	end
end


