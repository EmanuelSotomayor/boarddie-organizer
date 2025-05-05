package com.hex4w0rd.boarddie.services;

import com.hex4w0rd.boarddie.dto.BoardDTO;
import com.hex4w0rd.boarddie.dto.ColumnDTO;
import com.hex4w0rd.boarddie.request.BoardUpdateRequest;
import java.util.UUID;
import org.springframework.data.domain.Page;

public interface IBoardService {
    BoardDTO saveBoard(BoardDTO boardDTO);
    BoardDTO updateBoardById(UUID id, BoardUpdateRequest boardUpdateRequest);
    Boolean deleteBoardById(UUID id);
    BoardDTO getBoardById(UUID id);
    Page<BoardDTO> getAllBoards();
    Boolean updateBoardFavoriteStatus(Boolean check);
    Boolean addColumnToBoard(UUID boardId, ColumnDTO columnDTO);
    Boolean deleteColumnOfBoard(UUID boardId, UUID columnId);
    Boolean updateColumnOfBoard(UUID boardId, UUID columnId, ColumnDTO columnDTO);
}